class WheelAsset{
	constructor(x1, y1, sizeX, sizeY, image){
		this.pos = createVector(x1,y1);
        this.imageObj = image;
        this.size = createVector(sizeX, sizeY);
	}
	show(){
        image(this.imageObj,this.pos.x,this.pos.y,this.size.x,this.size.y);
	}
}