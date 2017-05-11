
package setting;

public class status {
	private static status sta=new status();
	private String txtSaveMode;
	private double sliderLight=50;
	private double sliderCall=50;
	private double sliderMusic=50;
	private double txtMusic;
	private status(){
		
	}
	public static status getInstacne(){
		return sta;
	}

	public String getTxtSaveMode() {
		return txtSaveMode;
	}

	public void setTxtSaveMode(String txtSaveMode) {
		this.txtSaveMode = txtSaveMode;
	}

	public double getSliderLight() {
		return sliderLight;
	}

	public void setSliderLight(double sliderLight) {
		this.sliderLight = sliderLight;
	}

	public double getSliderCall() {
		return sliderCall;
	}

	public void setSliderCall(double sliderCall) {
		this.sliderCall = sliderCall;
	}

	public double getSliderMusic() {
		return sliderMusic;
	}

	public void setSliderMusic(double sliderMusic) {
		this.sliderMusic = sliderMusic;
	}

	public double getTxtMusic() {
		return txtMusic;
	}

	public void setTxtMusic(double txtMusic) {
		this.txtMusic = txtMusic;
	}
	
}