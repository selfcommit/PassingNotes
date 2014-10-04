PassingNotes
============

NFC Reader App for NJIT

PassingNotes allows users to capture and pass information between NFC enabled devices and NFC tags/stickers.

Specific planned Features:
* Capture a note and store it for later
* Send a note to another copy of PassingNotes (Over NFC)
* Send a Picture to another copy of PassingNotes (Over NFC) - Maybe insert in the notes?
* Read Notes 

![Alt text](http://i.imgur.com/aaOHceD.png "Passing Notes")
![Alt text](Notes.png "All Notes")


Notes and Resources:
---

[Android NFC Information](http://developer.android.com/guide/topics/connectivity/nfc/index.html)

chose wtf/clowns and a reverse domain because I own clowns.wtf and knew it would avoid conflict.

Completed:
* Boots Hello World Activity
* Requests permissions for NFC
* include SQL light DB for stored captured 'Notes'
* Store notes in local SQLite DB
* Fill out 'View Notes' Activity (Call all notes in SQLite DB)

Todo:
* Add NFC intent based on nearby phone
* Add NFC intent based on sticker / Note
* Fill out 'Send a Note' Activity
* Add ability to browse for images stored on phone to share (Once the above is complete)
* ...More?

NiceToHave:
* Include Editor for stylized Notes
* Pass Pictures inside Notes
