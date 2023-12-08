function alertWeatherInfo(element) {
  alert("Loading weather report for..." + element.innerText);
  console.log(element.innerText);
  document.getElementsByClassName("city-name")[0].innerText = element.innerText;
}

function dismissAlert(element) {
  document.querySelector(element).remove();
}

function celsiusToFahrenheit(temp) {
  return temp * 1.8 + 32;
}

function fahrenheitToCelsius(temp) {
  return (temp - 32) / 1.8;
}

function convertTemp(measure) {
  let lowTempElts = document.getElementsByClassName("low-temp");
  let highTempElts = document.getElementsByClassName("high-temp");

  if (measure == "fahrenheit") {
    //converting from celsius to fahrenheit
    for (i = 0; i < lowTempElts.length; i++) {
      t = celsiusToFahrenheit(Number(lowTempElts[i].firstChild.innerText));
      lowTempElts[i].firstChild.innerText = Math.round(t);
    }
    for (i = 0; i < highTempElts.length; i++) {
      t = celsiusToFahrenheit(Number(highTempElts[i].firstChild.innerText));
      highTempElts[i].firstChild.innerText = Math.round(t);
    }
  } else {
    //converting from fahrenheit to celsius
    for (i = 0; i < lowTempElts.length; i++) {
      t = fahrenheitToCelsius(Number(lowTempElts[i].firstChild.innerText));
      lowTempElts[i].firstChild.innerText = Math.round(t);
    }
    for (i = 0; i < highTempElts.length; i++) {
      t = fahrenheitToCelsius(Number(highTempElts[i].firstChild.innerText));
      highTempElts[i].firstChild.innerText = Math.round(t);
    }
  }
}
