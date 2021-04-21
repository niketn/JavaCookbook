## An AWT GUI application called AWT Accumulator:-
which has four components:
1. A java.awt.Label “Enter an integer and press enter”;
2. An input java.awt.Textfield;
3. A java.awt.Label “Accumulated sum is” and 
4. A protected(read only) java.awt.TextField for displaying the accumulated sum.

The four GUI components are placed inside a container java.awt.Frame, arranged in FlowLayout. The program shall accumulate the numbers entered into the input TextField 
and display the accumulated sum on the display textfield.

*Java AWT (Abstract Windowing Toolkit) :- is an API to develop GUI or window-based application in java. Java AWT components are platform-dependent i.e. components are displayed according to the view of operating system. AWT is heavyweight i.e. its components uses the resources of system. The java.awt package provides classes for AWT api such as TextField, Label, TextArea, RadioButton, CheckBox, Choice, List etc.*

![image](https://user-images.githubusercontent.com/26967135/115552140-906b2800-a2c9-11eb-9417-82465891e979.png)

- Container: The Container is a component in AWT that can contain another components like buttons, textfields, labels etc. The classes that extend Container class are known as -container such as Frame, Dialog and Panel.
- Window: The window is the container that has no borders and menu bars. You must use frame, dialog or another window for creating a window.
- Panel: The Panel is the container that doesn't contain title bar and menu bars. It can have other components like button, textfield etc.
- Frame: The Frame is the container that contain title bar and can have menu bars. It can have other components like button, textfield etc.

To create simple awt example, you need a frame. There are two ways to create a frame in AWT.
- By extending Frame class (inheritance)
- By creating the object of Frame class (association)

## Event and Listener (Java Event Handling)
Changing the state of an object is known as an event. For example, click on button, dragging mouse etc. The java.awt.event package provides many event classes and Listener interfaces for event handling.
![image](https://user-images.githubusercontent.com/26967135/115552481-02dc0800-a2ca-11eb-91c2-cdf45b2dd32b.png)

### Steps to perform Event Handling
Following steps are required to perform event handling:
1. Implement the Listener interface and overrides its methods
2. Register the component with the Listener


