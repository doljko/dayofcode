function setup(){
  noCanvas();
  let r = floor(random(5)) + 1;
  let img = createImg('img/' + r + '.jpg' );
  img.size(windowWidth, windowHeight);
  img.position(0,0);
}
