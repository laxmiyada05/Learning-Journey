console.log("Debugging form submission...");
document.querySelector("#eventForm")?.addEventListener("submit", e => {
  debugger;
  console.log("Form submitted", e.target);
});
