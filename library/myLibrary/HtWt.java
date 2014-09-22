package myLibrary;

public class HtWt implements Comparable {
	
	int height;
	int width;
	
	public HtWt(int h, int w){
		this.height = h;
		this.width = w;
	}

	public int compareTo(Object s) {
		HtWt hw = (HtWt)s;
		if(height != hw.height){
			return ((Integer)this.height).compareTo((Integer)hw.height);
		}else{
			return ((Integer)this.width).compareTo((Integer)hw.width);
		}
	}
	
	public String toString() {
		return "(" + height + ", " + width + ")";
	}
	
	public boolean isBefore(HtWt other) {
		if (this.height < other.height && this.width < other.width) {
			return true;
		} else {
			return false;
		}
	}
	
}