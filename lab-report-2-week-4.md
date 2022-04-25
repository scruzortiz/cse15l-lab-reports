# Lab Report 2

**Code Change #1:**

Breaking the infinite loop when there is no braket/parenthesis:

![image](screenshots/Screenshot316.png)

[link to failure inducing input](https://github.com/scruzortiz/markdown-parser/blob/main/newtest-file.md)

Symptom:

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.base/java.util.Arrays.copyOf(Arrays.java:3512)
        at java.base/java.util.Arrays.copyOf(Arrays.java:3481)
        at java.base/java.util.ArrayList.grow(ArrayList.java:237)
        at java.base/java.util.ArrayList.grow(ArrayList.java:244)
        at java.base/java.util.ArrayList.add(ArrayList.java:454)
        at java.base/java.util.ArrayList.add(ArrayList.java:467)
        at MarkdownParse.getLinks(MarkdownParse.java:24)
        at MarkdownParse.main(MarkdownParse.java:40)

So when you ran the code, after a little while it would show that it was out of memory which indicated that it was running an infinite loop. The bug itself was caused when it could not find the specified string it would simply keep going with nothing to stop it.   

---

**Code Change #2:**

Processing an linke when it's an image link 

![image](screenshot/Screenshot320.png)

[link to failure inducing input](https://github.com/TheJoeship/markdown-parser-fork/commit/ca97f28fa6755f1d48b519a208765e39ffd9a4f2)

Symptom: 

Incorrect output: Program treats an image as a url
Output:
[https://something.com, berlin_wall.jpg, some-thing.html]

This would give the incorrect output because it would treat the link for an image as though it was a regular link. Since the image link setup is similar to a normal link it treats it aas though it is a link when it should not. 

---

**Code Change #3:** 

When there are parenthsis in the link

![image](screenshot/Screenshot321.png)

[link to failure inducing input](https://github.com/bsalvania/markdown-parser/commit/98d2429e664e5a49cc3501ce27a87d8a6dc61c91)

Symptom: 

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.base/java.util.Arrays.copyOfRange(Arrays.java:3822)
        at java.base/java.lang.StringLatin1.newString(StringLatin1.java:769)
        at java.base/java.lang.String.substring(String.java:2709)
        at MarkdownParse.getLinks(MarkdownParse.java:22)
        at MarkdownParse.main(MarkdownParse.java:33)

This would give another out of memory error. The bug itself was another infinite loop because it of the parenthesis in the link itself it would throw it off thinking it need to continue forever looking for the parenthesis again.
