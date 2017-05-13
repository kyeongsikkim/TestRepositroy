
package setting;

public class status {
	private static status sta=new status();
	private String txtSaveMode;
	private double sliderLight=50;
	private double sliderCall=50;
	private double sliderMusic=50;
	private String txtMusic;
	private String imag1;
	private String img2;
	private double sliderCall1=50;
	private double sliderMusic1=50;
	private String txtMusic1;
	private String imag11;
	private String img21;
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

	public String getTxtMusic() {
		return txtMusic;
	}

	public void setTxtMusic(String txtMusic) {
		this.txtMusic = txtMusic;
	}

	public String getImag1() {
		return imag1;
	}

	public void setImag1(String imag1) {
		this.imag1 = imag1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public double getSliderCall1() {
		return sliderCall1;
	}

	public void setSliderCall1(double sliderCall1) {
		this.sliderCall1 = sliderCall1;
	}

	public double getSliderMusic1() {
		return sliderMusic1;
	}

	public void setSliderMusic1(double sliderMusic1) {
		this.sliderMusic1 = sliderMusic1;
	}

	public String getTxtMusic1() {
		return txtMusic1;
	}

	public void setTxtMusic1(String txtMusic1) {
		this.txtMusic1 = txtMusic1;
	}

	public String getImag11() {
		return imag11;
	}

	public void setImag11(String imag11) {
		this.imag11 = imag11;
	}

	public String getImg21() {
		return img21;
	}

	public void setImg21(String img21) {
		this.img21 = img21;
	}
	
	
	
}