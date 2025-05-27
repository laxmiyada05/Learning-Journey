function addEvent(e) {
  events.push(e);
}
function registerUser(name, eventName) {
  console.log(`${name} registered for ${eventName}`);
}
function filterEventsByCategory(cat) {
  return events.filter(e => e.category === cat);
}
function categoryCounter() {
  let counts = {};
  return function (category) {
    counts[category] = (counts[category] || 0) + 1;
    return counts[category];
  };
}
const countCategory = categoryCounter();
