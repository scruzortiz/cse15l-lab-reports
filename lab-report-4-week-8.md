# Lab  Report 4

**Link to my repository**
---
[this is the link](https://github.com/scruzortiz/fresh_markdown-parser.git)

**Link to the repository I reviewed**
---
[this is the other link](https://github.com/scruzortiz/markdown-parser-review.git)

**The new JUnit tests for my reposityory**
---
![Screenshot (337)](https://user-images.githubusercontent.com/103283836/169908416-c8d0b921-ee5f-49a4-a057-0d0492118fde.png)

**Snippet 1:**
--- 
It should equal: 
("url.com", "`google.com", "google.com", "ucsd.edu")
This one does not pass the JUnit test --> it does not record the last link as a link:

![my-snippet1test - Copy](https://user-images.githubusercontent.com/103283836/169908901-3624387c-8798-4aa9-9402-9cc42643a48d.png)

**Snippet 2:**
---
It should equal:
("b.com", "a.com", "example.com")
It does not pass the JUnit test --> it records the embeded link versus the actual link:

![my-snippet2test - Copy](https://user-images.githubusercontent.com/103283836/169908934-4c95bc8e-5810-434d-ace2-3c59f5bd45f1.png)

**Snippet 3:**
---
It should equal: 
("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15-spring-2022/schedule", "https://cse.ucsd.edu/")
It does not pass the JUnit test --> it records all the spaces with the links (correct links but wrong spacing):

![my-snippet3test - Copy (3)](https://user-images.githubusercontent.com/103283836/169908952-f2d9b500-d2d5-4035-9a0b-dc218ae39436.png)

**The new JUnit tests for the repository I reviewed**
--

![Screenshot (337)](https://user-images.githubusercontent.com/103283836/169910418-931b8d27-a46f-4cf8-8670-f1557e11f68b.png)

**Snippet 1:**
---
It should equal: 
("url.com", "`google.com", "google.com", "ucsd.edu")

This one does pass the tests.

**Snippet 2:**
---
It should equal:
("b.com", "a.com", "example.com")
It does not pass the JUnit test --> it records the embeded link versus the actual link:

![review-snippet2 - Copy](https://user-images.githubusercontent.com/103283836/169910529-5aadc404-e57b-410e-878b-bd932e6a980a.png)

**Snippet 3:***
---
It should equal: 
("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15-spring-2022/schedule", "https://cse.ucsd.edu/")

It does not pass the JUnit test --> it records all the spaces with the links (correct links but wrong spacing):

![review-snippet3 - Copy](https://user-images.githubusercontent.com/103283836/169910553-05f7693c-386f-4bdd-a932-c7a2f26980ce.png)

**Question 1:**
---
I think for mine I need to fix a couple of the if statements so that way it will be able to collect the last link.
**Question 2:**
---
For this fix since I would already be looking at the if satements to fix snippet1 I would edit the if statements concerning the brakets since that seems to be the issue for getting the imbeded link instead of the actual link.

**Question 3:**
---
I think there may be. The issue with this snippet is the spacing which throws the array list off. If there is a way to be able to overlook at the spacing and make sure there is no extra sopaces that aren't needed
