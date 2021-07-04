module.exports = {
  buildOptions: {
    out: "./target/build",
  },
  mount: {
    public: "/",
    "target/scala-2.13/scalajs-capacitor-fastopt": "/",
    "src/main/resources": "/"
  },
}