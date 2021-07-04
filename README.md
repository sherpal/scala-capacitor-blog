# Example mobile application with Scala and Capacitor

This is a small example of making a cross-platform mobile application using [Scala](https://www.scala-lang.org/) and [Capacitor](https://capacitorjs.com/).

This repo accompanies a blog post that I wrote (see [here](todo))

## Requirements

In order to run this, you will need:

- [sbt](https://www.scala-sbt.org/)
- [npm](https://www.npmjs.com/) (>= 14)
- [Android Studio](https://developer.android.com/studio)

## Run all

You can sequentially issue the following commands in order to have an Android emulator launching the application:

```
# Installing npm dependencies
npm install
# Compiling scala code
sbt fastLinkJS
# (optional) Check that the above worked by running Snowpack dev server (a browser should open with "Hello World")
npx snowpack dev
# Building frontend app with Snowpack
npx snowpack build
# Syncing the build with the Android application
npx cap sync
# Running the Android emulator (it will ask you to select an emulator, default will do)
npx cap run android
```


