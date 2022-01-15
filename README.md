### Hi there 👋

<!--
**Rajdeep1234/Rajdeep1234** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.

Here are some ideas to get you started:

- 🔭 I’m currently working on ...leetcode
- 🌱 I’m currently learning ...system design / concurrency
- 👯 I’m looking to collaborate on ... 
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->
**NOTE 1:**
Fail-fast means when you try to modify the content when you are iterating thru it, it will fail and throw ConcurrentModificationException.

Set keys = hashMap.keySet();
for (Object key : keys) {
    hashMap.put(someObject, someValue); //it will throw the ConcurrentModificationException here
} 
For HashTable enumeration:

 Enumeration keys = hashTable.keys();
 while (keys.hasMoreElements()) {
          hashTable.put(someKey, someValue);  //this is ok
    }
    
    The Hastable's iterators are fail-fast. Its enumerations are not. 
**NOTE2 :**
java -jar app.jar --spring.config.location=file:///Users/home/config/jdbc.properties

Low level design
https://www.linkedin.com/pulse/cracking-he-low-level-design-lld-interview-shashi-bhushan-kumar/
https://github.com/prasadgujar/low-level-design-primer
https://github.com/donnemartin/system-design-primer
https://github.com/donnemartin?tab=repositories
https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions.md
https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions.md

Leetcode patterns

https://github.com/seanprashad/leetcode-patterns

https://drive.google.com/file/d/1ao4ZA28zzBttDkuS6MLQI52gDs_CJZEm/view
https://www.educative.io/courses/grokking-the-coding-interview
https://hackernoon.com/14-patterns-to-ace-any-coding-interview-question-c5bb3357f6ed
https://www.teamblind.com/post/New-Year-Gift---Curated-List-of-Top-100-LeetCode-Questions-to-Save-Your-Time-OaM1orEU
https://seanprashad.com/leetcode-patterns/

Inerview Questions
https://leetcode.com/discuss/interview-question?currentPage=1&orderBy=hot&query=

