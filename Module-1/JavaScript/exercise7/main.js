document.addEventListener("DOMContentLoaded", () => {
  const container = document.querySelector("#eventContainer");
  events.forEach(e => {
    const card = document.createElement("div");
    card.textContent = `${e.name} - ${e.date}`;
    container?.appendChild(card);
  });
});
