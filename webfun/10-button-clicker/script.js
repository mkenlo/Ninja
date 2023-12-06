function doLogin(element) {
  if (element.innerText === "Login") element.innerText = "Logout";
  else element.innerText = "Login"
  
}

function hide(element) {
  element.remove();
}

function addLikes(element) {
  let likes = Number(element.innerText.split(" ")[0]);
  element.innerText = String(likes + 1).concat(" Likes");
  alert("Ninja was liked");
}
