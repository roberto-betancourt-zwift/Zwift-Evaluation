## README
The objective of this project is to create a user interface with the following :

- A button with the text "Scan" that when tapped, will display the peripherals emitted by the `getPeripherals`
function in `PeripheralSource.kt` in a list with the name of the peripheral as well as an image
available in the `drawable` folder. If any of the properties are null, then display "Unknown"
- When tapping into a peripheral, the user will be redirected to a new screen that displays all of the
peripheral's properties 
- The screen will also contain a button with the text "Update" that will only be visible if the peripheral
has an update available from the `getAvailableUpdates` function in `PeripheralSource.kt`