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
