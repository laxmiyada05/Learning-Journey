const events = [
  { name: "Gardening Workshop", date: "2025-06-10", seats: 5 },
  { name: "Music Night", date: "2024-12-20", seats: 0 },
  { name: "Tech Meetup", date: "2025-07-01", seats: 10 }
];
events.forEach(event => {
  if (new Date(event.date) > new Date() && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name}`);
  }
});
function register(user, event) {
  try {
    if (event.seats > 0) {
      event.seats--;
      console.log(`${user} registered for ${event.name}`);
    } else {
      throw new Error("No seats left!");
    }
  } catch (err) {
    console.error(err.message);
  }
}
