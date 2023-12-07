function addLikes(id) {
  let element = document.querySelector(id + " .likes-count");
  let likesCount = Number(element.innerText.split(" ")[0]);
  element.innerHTML = String(likesCount + 1).concat(" Like(s)");
}
