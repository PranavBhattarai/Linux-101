#This includes all infortant information regarding BIOS, GPT, MBR, Legacy devices, UEFI, EFI, etc. So admin can install OS peacefully

1. How to delete unwanted boot records form Windows?

To remove OS from Windows boot configuration:
- msconfig					// Win + R
- Go to 'boot' option
- Delete the OS you don't want to show up in Windows Environment

[ This is important, if had 2 Windows OS installed. And you no longer want old unused OS anymore.]

2. Which is best to choose?

- GPT is best in comparision with MBR.				// Both are : Partition Scheme
- UEFI is best in comparision with Legacy boot (BIOS).		// Both are : Boot process

[ BIOS	=  Basic Input & Output System	(Legary boot process)	]
[ which better choice:	GPT > MBR	&	UEFI > BIOS 	]
[ UEFI mainly support GPT.					]

3. What is EFI & ESP?

- EFI = UEFI store all information in .efi file; which is kept in special disk called "ESP".

[ ESP = EFI System Partition ]

4. What is UEFI with CSMP (hybrid) VS UEFI without CSMP (native)?			// First observed in HP laptop

- UEFI with CSMP	----->>		support both BIOS & UEFI boot process.
- UEFI without CSMP	----->>		support only UEFI boot process.			// doesn't support traditional/old BIOS boot

[ CSMP = Compatibility Support Module ]

5. Is there a dual boot in a Laptop/Desktop? If yes then,

- Disable Windows fastboot			// helps to properly dismount the volumes/drives on shutdown

  - Control Panel
	 -> 'Change what Power button do' 
		-> 'Change settings currently unavailable'	
			-> uncheck 'Fast Startup'

[At which point the Linux drivers & fsck can deal with the drives just fine.]

6.
