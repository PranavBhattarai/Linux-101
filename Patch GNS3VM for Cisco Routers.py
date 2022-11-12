#! /usr/bin/python3
print("*********************************************************************")
print("This script is only for studying. It shall be used only for Education Purpose Only.")
import os
import socket
import hashlib
import struct

# get the host id and host name to calculate the hostkey
hostid=os.popen("hostid").read().strip()		 	#for linux working fine
hostid=str(os.popen('hostid','r',-1)).split()[-1][2:-1] 	# for freebsd working with version 12.2
hostname = socket.gethostname()
ioukey=int(hostid,16)
for x in hostname:
 ioukey = ioukey + ord(x)
print("hostid=" + hostid +", hostname="+ hostname + ", ioukey=" + hex(ioukey)[2:])

# create the license using md5sum
iouPad1 = b'\x4B\x58\x21\x81\x56\x7B\x0D\xF3\x21\x43\x9B\x7E\xAC\x1D\xE6\x8A'
iouPad2 = b'\x80' + 39*b'\0'
md5input=iouPad1 + iouPad2 + struct.pack('!Q', ioukey) + iouPad1 #change for i to Q for freebsd
iouLicense=hashlib.md5(md5input).hexdigest()[:16]

print("\n Add the following text to ~/.iourc:")
print("[license]\n" + hostname + " = " + iouLicense + ";\n")
with open("iourc.txt", "wt") as out_file:
   out_file.write("[license]\n" + hostname + " = " + iouLicense + ";\n")
print("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\nAlready copy to the file iourc.txt\n ")

print("You can disable the phone home feature with something like:")
print(" echo '127.0.0.127 xml.cisco.com' >> /etc/hosts\n")

#THX for  @hirman74
# hirman74  in line 10 and 18
