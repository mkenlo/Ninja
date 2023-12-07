let names = [
  "Meredith Grey",
  "Cristina Hang",
  "Alicia Florick",
  "Lucia Quinn",
  "Diane Lockhart",
];

function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}

function editProfile(elementId) {
  let i = getRandomInt(names.length);
  console.log(i);
  document.getElementById(elementId).innerText = names[i];
}

function removeConnectionRequest(elementId) {
  document.getElementById(elementId).remove();
  document.querySelector("#connection-requests .pills").innerText--;
  if (
    document.querySelector("#connection-requests .list-item").children.length ==
    0
  )
    document.getElementById("connection-requests").remove();
}

function addConnection(elementId) {
  removeConnectionRequest(elementId);
  document.querySelector("#your-connections .pills").innerText++;
}
