package pe.com.dyd.patrones.ejemplos.abstractFactory.colors;

import pe.com.dyd.patrones.ejemplos.abstractFactory.general.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String type) {
		if ("White".equalsIgnoreCase(type)) {
			return new White();
		} else if ("Black".equalsIgnoreCase(type)) {
			return new Black();
		}
		
		return null;
	}
}
