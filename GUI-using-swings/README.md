# Design a calculator using swings.

*Swing API is set of extensible GUI Components to ease developer's life to create JAVA based Front End/ GUI Applications. It is build upon top of AWT API and acts as 
replacement of AWT API as it has almost every control corresponding to AWT controls. Swing component follows a Model-View-Controller architecture to fulfill the following criterias.*
- A single API is to be sufficient to support multiple look and feel.
- API is to model driven so that highest level API is not required to have the data.
- API is to use the Java Bean model so that Builder Tools and IDE can provide better services to the developers to use it.

## MVC Architecture
Swing API architecture follows loosely based MVC architecture in the following manner.
- A Model represents component's data.
- View represents visual representation of the component's data.
- Controller takes the input from the user on the view and reflects the changes in Component's data.
- Swing component have Model as a seperate element and View and Controller part are clubbed in User Interface elements. Using this way, Swing has pluggable look-and-feel 
  architecture.

## Swing features
- Light Weight - Swing component are independent of native Operating System's API as Swing API controls are rendered mostly using pure JAVA code instead of underlying 
operating system calls.
- Rich controls - Swing provides a rich set of advanced controls like Tree, TabbedPane, slider, colorpicker, table controls
- Highly Customizable - Swing controls can be customized in very easy way as visual apperance is independent of internal representation.
- Pluggable look-and-feel- SWING based GUI Application look and feel can be changed at run time based on available values.

## Every user interface considers the following three main aspects:
- UI elements : These are the core visual elements the user eventually sees and interacts with. GWT provides a huge list of widely used and common elements varying from basic to complex which we will cover in this tutorial.
- Layouts: They define how UI elements should be organized on the screen and provide a final look and feel to the GUI (Graphical User Interface). This part will be covered in 
Layout chapter.
- Behavior: These are events which occur when the user interacts with UI elements. This 
part will be covered in Event Handling chapter.

