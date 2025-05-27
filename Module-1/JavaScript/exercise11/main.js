
document.querySelector("#eventForm")?.addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.elements.name.value;
  const email = this.elements.email.value;
  if (!name || !email.includes("@")) {
    alert("Invalid input");
    return;
  }
  console.log(`User ${name} with ${email} registered`);
});
