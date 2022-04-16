const backgroundPath = 'Assets/fundo.png';
const minorInnerDiscPath = 'Assets/internoMenor.png';
const majorInnerDiscPath = 'Assets/internoMaior.png';
const minorOuterDiscPath = 'Assets/externoMenor.png';
const majorOuterDiscPath = 'Assets/externoMaior.png';
const structureFactorPath = 'Assets/fatorEstrutural.png';
const structureFactorAltPath = 'Assets/fatorEstrutural2.png';
const qualQuestionPath = 'Assets/perguntaQualificante.png';
const techQuestionPath = 'Assets/perguntaTecnica.png';
const randomPath = 'Assets/randomico.png';
let backgroundImage;
let minorInnerDiscImage;
let majorInnerDiscImage;
let minorOuterDiscImage;
let majorOuterDiscImage;
let structureFactorImage;
let structureFactorAltImage;
let qualQuestionImage;
let techQuestionImage;
let randomImage;
let minorInnerDiscObj;
let majorInnerDiscObj;
let minorOuterDiscObj;
let majorOuterDiscObj;
let structureFactorObj;
let structureFactorAltObj;
let qualQuestionObj;
let techQuestionObj;
let randomObj;

function preload(){
  backgroundImage = loadImage(backgroundPath);
  minorInnerDiscImage = loadImage(minorInnerDiscPath);
  majorInnerDiscImage = loadImage(majorInnerDiscPath);
  minorOuterDiscImage = loadImage(minorOuterDiscPath);
  majorOuterDiscImage = loadImage(majorOuterDiscPath);
  structureFactorImage = loadImage(structureFactorPath);
  structureFactorAltImage = loadImage(structureFactorAltPath);
  qualQuestionImage = loadImage(qualQuestionPath);
  techQuestionImage = loadImage(techQuestionPath);
  randomImage = loadImage(randomPath);
}

function setup() {
  createCanvas(900, 900);
  minorInnerDiscObj = new WheelAsset(-3, 40, 700, 700, majorOuterDiscImage);
  majorInnerDiscObj = new WheelAsset(-3, 40, 700, 700, minorOuterDiscImage);
  minorOuterDiscObj = new WheelAsset(150, 190, 400, 400, majorInnerDiscImage);
  majorOuterDiscObj = new WheelAsset(230, 265, 250, 250, minorInnerDiscImage);
  structureFactorObj = new ButtonAsset(740, 200, 115, 115, structureFactorImage);
  structureFactorAltObj = new ButtonAsset(740, 300, 115, 115, structureFactorAltImage);
  qualQuestionObj = new ButtonAsset(740, 400, 115, 115, qualQuestionImage);
  techQuestionObj = new ButtonAsset(740, 500, 115, 115, techQuestionImage);
  randomObj = new ButtonAsset(740, 600, 115, 115, randomImage);
}

function draw() {
  background(220);
  image(backgroundImage,0,0,700,700);
  minorInnerDiscObj.show();
  majorInnerDiscObj.show();
  minorOuterDiscObj.show();
  majorOuterDiscObj.show();
  structureFactorObj.show();
  structureFactorAltObj.show();
  qualQuestionObj.show();
  techQuestionObj.show();
  randomObj.show();
}