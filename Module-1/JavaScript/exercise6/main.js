let allEvents = [];
allEvents.push({ name: "Food Fest", category: "Food" });
const musicOnly = allEvents.filter(e => e.category === "Music");
const eventCards = allEvents.map(e => `Event: ${e.name}`);
