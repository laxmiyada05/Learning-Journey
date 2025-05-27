document.querySelector("#registerBtn")?.addEventListener("click", () => {
  alert("Thanks for registering!");
});
document.querySelector("#categoryFilter")?.addEventListener("change", (e) => {
  const category = e.target.value;
  console.log("Filtered:", filterEventsByCategory(category));
});
document.querySelector("#searchBox")?.addEventListener("keydown", (e) => {
  console.log("Key pressed:", e.key);
});
