# CustomFontWidgets
Android library for setting custom fonts to UI Widgets. Works with 4.2+ [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

currently it includes following UI Widgets.
* FontTextView
* FontEditText
* FontCheckBox
* FontRadioButton
* FontButton

### Demo
<div align="left">
    <img src="/Screenshots/Screenshot_20200818-103901_CustomFontWidgetsSample.jpg" width="420px" height="800"</img> 
</div>

## Getting Started
<b>1.</b> Add Gradle dependency to your `build.gradle`:
```gradle
dependencies {
   implementation 'awesome.vrund.customfontwidgets:CustomFontWidgets:1.0.1@aar'
}
```
<b>2.</b> create `fonts` folder inside your `assets` folder. and move your fonts inside that folder
<div align="left">
    <img src="/Screenshots/Screenshot 2020-08-18 at 11.04.08 AM.png" height="100px"</img> 
</div>

<b>3.</b> Add any of the available widegt in your XML file.

```xml
<awesome.vrund.customfontwidgets.FontTextView
    android:id="@+id/fontTextView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello,"
    android:textColor="@android:color/black"
    android:textSize="24sp"
    app:customFont="Spooky.ttf" />
```
Set custom font using
```xml
app:customFont="Spooky.ttf"
```

or Programmatically 
```java
fontTextView.setCustomFont("Spooky.ttf");
```
BINGO!!!!!! you are good to go

## Developed By
* Vrund Purohit - vrund14@gmail.com
