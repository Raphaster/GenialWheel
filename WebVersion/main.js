const minorInnerDisc = 'Assets/internoMenor.png'
const majorInnerDisc = 'Assets/internoMaior.png'
let disc;

function preload(){
  minorIdisc = loadImage(minorInnerDisc);
  majorIdisc = loadImage(majorInnerDisc);
}

function setup() {
  createCanvas(900, 900);
}

function draw() {
  background(220);
  image(majorIdisc,50,50,400,400);
  image(minorIdisc,50,50,250,250);
}