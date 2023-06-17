# JavaAudio

Resource: 
Audio Wav converter
https://audio.online-convert.com/convert-to-wav

Overview:
Following a YouTube video, I created a simple audio using a scanner and while loop.
An audio can be downloaded by googling YouTube audio library. I place to import javax.sound.
sampled.* at the top. Since its not compatible with MP3, use the link to convert it into a wav. 
There were also a throw declaration for AudioInputStream and for the open method. In addition,
a few other imports were also included. 

How?

Make an audio file by adding the file name or use the pathway inside the parentheses. 
Create an AudioInputStream to convert the audio into a stream. 
Make an object clip. 
By opening the audio into a clip, create an open method with AudioInputStream inside the arguement. 
Assign the response as a String variable and make a scanner for inputing the user's choice.
To prompt the user, use a while loop to ask for an action. 
Include a next() and an toUpperCase method inside the loop.
Create a switch to assign a key to a specific action. 
For the reset, use setMicrosecondPosition(0) method and to quit use close() method.
Outside the switch, make a println to see a message after escaping the while loop. 





