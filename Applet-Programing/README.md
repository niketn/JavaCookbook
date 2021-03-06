# A program to design an applet that does the following:

1. Displays your name in Devanagri.
2. Draw a Clown Face.
3. Draw a Bar chart and a line graph for a given set of values.
4. Accept the Shape and itβs specification from the User and draw it.

## NOTE: to execute each applet files i have used a single html file, by just changing the applet file name in the desired place/tag (so would upload only one html file)

An applet is a Java program that runs in a Web browser. An applet can be a fully functional Java application because it has the entire Java API at its disposal.
There are some important differences between an applet and a standalone Java application, including the following β
- An applet is a Java class that extends the java.applet.Applet class.
- A main() method is not invoked on an applet, and an applet class will not define main().
- Applets are designed to be embedded within an HTML page.
-  When a user views an HTML page that contains an applet, the code for the applet is downloaded to the user's machine.
- A JVM is required to view an applet. The JVM can be either a plug-in of the Web browser or a separate runtime environment.
- The JVM on the user's machine creates an instance of the applet class and invokes various methods during the applet's lifetime.
- Applets have strict security rules that are enforced by the Web browser. The security of an applet is often referred to as sandbox security, comparing the applet to a child playing in a sandbox with various rules that must be followed.
- Other classes that the applet needs can be downloaded in a single Java Archive (JAR) file.

## Life Cycle of an Applet
Four methods in the Applet class gives you the framework on which you build any serious applet 
- init β This method is intended for whatever initialization is needed for your applet. It is called after the param tags inside the applet tag have been processed.-
- start β This method is automatically called after the browser calls the init method. It is also called whenever the user returns to the page containing the applet after having gone off to other pages.
- stop β This method is automatically called when the user moves off the page on which the applet sits. It can, therefore, be called repeatedly in the same applet.
- destroy β This method is only called when the browser shuts down normally. Because applets are meant to live on an HTML page, you should not normally leave resources behind after a user leaves the page that contains the applet.
- paint β Invoked immediately after the start() method, and also any time the applet needs to 
repaint itself in the browser. The paint() method is actually inherited from the java.awt.

## The Applet Class
Every applet is an extension of the java.applet.Applet class. The base Applet class provides methods that a derived Applet class may call to obtain information and services from the browser context.
These include methods that do the following β
- Get applet parameters
- Get the network location of the HTML file that contains the applet
- Get the network location of the applet class directory
- Print a status message in the browser
- Fetch an image
- Fetch an audio clip
- Play an audio clip
- Resize the applet

Additionally, the Applet class provides an interface by which the viewer or browser obtains 
information about the applet and controls the applet's execution. The viewer may β
- Request information about the author, version, and copyright of the applet
- Request a description of the parameters the applet recognizes
- Initialize the applet
- Destroy the applet
- Start the applet's execution
- Stop the applet's execution

The Applet class provides default implementations of each of these methods. Those implementations may be overridden as necessary. 

## Invoking an Applet
An applet may be invoked by embedding directives in an HTML file and viewing the file through  an applet viewer or Java-enabled browser.
The <applet> tag is the basis for embedding an applet in an HTML file. The code attribute of the <applet> tag is required. It specifies the Applet class to run. Width and height are also required to specify the initial size of the panel in which an applet runs. The applet directive must be closed with an </applet> tag. If an applet takes parameters, values may be passed for the parameters by adding <param> tags between <applet> and </applet>. The browser ignores text and other tags between the applet tags.
Non-Java-enabled browsers do not process <applet> and </applet>. 
  
Therefore, anything that appears between the tags, not related to the applet, is visible in non-Java-enabled browsers.The viewer or browser looks for the compiled Java code at the location of the document.

## Application Conversion to Applets
It is easy to convert a graphical Java application (that is, an application that uses the AWT and that you can start with the Java program launcher) into an applet that you can embed in a web page.

## Following are the specific steps for converting an application to an applet.
- Make an HTML page with the appropriate tag to load the applet code.
- Supply a subclass of the JApplet class. Make this class public. Otherwise, the applet 
cannot be loaded.
- Eliminate the main method in the application. Do not construct a frame window for the 
application. Your application will be displayed inside the browser.
- Move any initialization code from the frame window constructor to the init method of the 
applet. You don't need to explicitly construct the applet object. The browser instantiates it 
for you and calls the init method.
- Remove the call to setSize; for applets, sizing is done with the width and height 
parameters in the HTML file.
- Remove the call to setDefaultCloseOperation. An applet cannot be closed; it terminates 
when the browser exits.
- If the application calls setTitle, eliminate the call to the method. Applets cannot have title 
bars. (You can, of course, title the web page itself, using the HTML title tag.)
- Don't call setVisible(true). The applet is displayed automatically.
