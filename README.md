# 🧱 DiscordMessageComponents
Java Library for Discord message object creation
A Java Library which allows you to create discord message-related objects:
- Webhook Message
- Embeds 💬
    - Author 🧑🏻
    - Body 📝
    - Fields 🔖
    - Images 🌆
    - Footer ⏰
- Attachments 🗂️

...and serialise them into JSON strings later!

Of course, you can manually construct a Java map for a discord webhook message / embed / etc and serialise it with google Gson, but this library simply tries to make it easier.

Also this is just a good opportunity for me to learn Java. ☕️

## ✨ Using the library
Download the latest jar file from releases and place it in a new folder called `libs`. This folder should be inside the parent directory of your `src` folder and in the same directory where `build.gradle.kts` is located.

Add the following dependency to your `build.gradle.kts` file:
```kts
dependencies {
    implementation(files("libs/DiscordMessageComponents-all.jar"))
}
```

The library is a fat jar which already includes the dependencies upon which this library depends on, so theres no need to manually import its dependencies such as Gson by Google.

## ❓ null support
This library currently does **NOT** have null support. You therefore cannot just provide null as an argument to the Embed constructor and expect it to work.

I am actively working on null support. It's actually quite trivial really, but I'm a bit lazy atm and don't really have time.

In the meantime, just create empty objects.

## 📝 Examples
### Example 1: Full embed
```java
// Imports
import java.util.List;
import java.util.ArrayList;

// Creating the embed
Colour embedColour = new Colour();
embedColour.fromHex("#ff4e4e");

// Embed fields
List<EmbedField> fieldList = new ArrayList<>();
fieldList.add(new EmbedField("Field Name", "Value of the field", false));
fieldList.add(new EmbedField("Another Field", "With even more text", true));
fieldList.add(new EmbedField("A third field?!", "And it's even inline with the second one!", true));

// Author and footer
EmbedAuthor author = new EmbedAuthor("Author", "https://numelon.com", "https://numelon.com/webicon.png");
EmbedFooter footer = new EmbedFooter("Footer Text", "2024-05-06T18:20:00.000Z", "https://numelon.com/webicon.png");

// Creating the actual embed and serialising it to json
Embed embed = new Embed("Embed Title", "Here's the description", "https://numelon.com", embedColour, fieldList, "https://numelon.com/webicon.png", author, footer);
return embed.toJson();
```

This returns the following json string:
```json
{
  "thumbnail": {
    "url": "https://numelon.com/webicon.png"
  },
  "color": 16731726,
  "footer": {
    "icon_url": "https://numelon.com/webicon.png",
    "text": "Footer Text"
  },
  "author": {
    "icon_url": "https://numelon.com/webicon.png",
    "name": "Author",
    "url": "https://numelon.com"
  },
  "description": "Here\u0027s the description",
  "title": "Embed Title",
  "fields": [
    {
      "name": "Field Name",
      "value": "Value of the field"
    },
    {
      "name": "Another Field",
      "value": "With even more text"
    },
    {
      "name": "A third field?!",
      "value": "And it\u0027s even inline with the second one!"
    }
  ],
  "url": "https://numelon.com",
  "timestamp": "2024-05-06T18:20:00.000Z"
}
```

Which looks like this:

![Embed example 1](/docs/readme/embed-example1.png)

### Example 2: Using empty objects
TODO