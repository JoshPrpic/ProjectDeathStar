package Rendering;

public class SpriteSheet {
	
	private Texture texture;
	private int width, height;
	
	public SpriteSheet(Texture texture, int size){
		this(texture, size, size);
	}
	
	public SpriteSheet(Texture texture, int width, int height){
		this.texture = texture;
		this.width = width;
		this.height = height;
	}
	
	//returns the texture
	public Texture getTexture(){
		return texture;
	}
	
	//returns the width
	public int getWidth(){
		return width;
	}
	
	//returns the height
	public int getHeight(){
		return height;
	}
	
	
}
