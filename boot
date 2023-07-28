#This includes all infortant information regarding BIOS, GPT, MBR, Legacy devices, UEFI, EFI, etc. So admin can install OS peacefully

1. How to delete boot records form Windows?

To remove OS from Windows boot configuration:
- msconfig					// Win + R
- Go to 'boot' option
- Delete the OS you want to show up in Windows Environment

[ This is important, if had 2 Windows OS installed. And you no longer want old unused OS anymore.]

2. Which is best to choose?

- GPT is best in comparision with MBR.				// Both are : Partition Scheme
- UEFI is best in comparision with Legacy boot (BIOS).		// Both are : Boot process

[ BIOS ---->>	Basic Input & Output System		]
[ In short:	GPT > MBR	&	UEFI > BIOS 	]
[ UEFI mainly support GPT.				]

3. What is EFI & ESP? 

- EFI	= UEFI store all information in .efi file; which is kept in special disk called "ESP".
- ESP	= EFI System Partition
