package sec11.static_fianl;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	//스태틱 변수 초기화
	static {
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS;
	}

	
	

}
