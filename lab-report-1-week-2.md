# How to log on to a course specific account on ieng6 on *Windows*:


**Step 1: Download VScode to your device:**
---
Go to the **visual studio code website** [here](https://code.visualstudio.com/). 
Select download to and follow those instructions to download.
                                               
Once you've downloaded VSCode open the application, it should look like this: 

![Image](Screenshot(314).jpg)                                                

**Step 2: Remotely Connecting:**
---
Go to settings and follow [these](https://docs.microsoft.com/en-us/windows-server/administration/openssh/openssh_install_firstuse) directions for installation of OpenSSH Client and OpenSSh Server. 
With your course-specific username open VSCode and open a new terminal (Ctrl + `)
                                  
Enter this command in your terminal(with the ___ replaced by the letters in your username): ssh cs15lsp22___@ieng6.ucsd.edu
Do not panic if there is a message the authenticity can't be established it's normal for your first time! Enter yes when asked if your sure you want to continue connecting.

Enter your password for your course-specific account. It should look like this: 
![Image](Screenshot (305).png)
                                  
\*IMPORTANT NOTE:* to exit from ieng6 terminal in a new terminal line enter: *exit*                                  
                                  
**Step 3: Trying Some Commands:**
---
Try out some commands from below by simply inputting one of the following into the terminal:

* cd ~
* cd
* ls -lat
* ls -a
* cp /home/linux/ieng6/cs15lsp22/public/hello.txt ~/
* cat /home/linux/ieng6/cs15lsp22/public/hello.txt

Here is an example output with cp:
![Image](Screenshot (306).png) 
                                 
**Step 4: Moving Files with scp:**
---
Log out of ieng6 and create a your java file and save it. Then open a new terminal and enter: 

scp (file name) cs15lsp___@ieng6.ucsd.edu:~/

When prompted enter your password. Then log into back into ieng6 with (ssh cs15lsp22___@ieng6.ucsd.edu) and enter the command: ls

This will show you that the file is in your directory. It should look like this:

![Image](Screenshot(307).png)
![Image](Screenshot (308).png)
                                  
**Step 5: Setting an SHH Key:**   
---
Make sure you are logged out ieng6. Since we are using windows just enter: ssh-keygen -t ed25519. When prompted to enter a file just hit *enter*. When prompted to enter a passphrase just hit *enter*.
Log back into ieng6. Once loged in enter mkdir .shh. Logout of ieng6. Then enter the following line into your terminal: /Users/(username)/.ssh/id_ed25519.pub cs15lsp22__@ieng6.ucsd.edu:~/.ssh/authorized_keys. When prompted enter the password you've been using.
                                  
To make sure everything worked simply log back into ieng6 and you should be able to log in without having to enter a password.
                                  
The entire process should look like this:

![Image](Screenshot (311).png)
![Image](Screenshot (312).png)
                                  
**Step 6: Optimizing Remote Running:**
---
To cut down on things you have to enter into the terminal one thing is to enter the command you want to execute at the end of your ssh command in parenthesis.
                                  
For example: 
ssh cs15lsp22___@ieng6.ucsd.edu "ls"

![Image](Screenshot (313).png)
                                  
                                  


                                              
