const fetchEvents = () => {
  fetch("https://api.example.com/events")
    .then(res => res.json())
    .then(data => console.log("Fetched Events:", data))
    .catch(err => console.error("Fetch error:", err));
};
async function getEventsAsync() {
  try {
    document.querySelector("#loader")?.classList.remove("hidden");
    const res = await fetch("https://api.example.com/events");
    const data = await res.json();
    console.log("Async Events:", data);
  } catch (err) {
    console.error(err);
  } finally {
    document.querySelector("#loader")?.classList.add("hidden");
  }
}
