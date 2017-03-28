package ortiz.perez.albin.resolver;

import java.beans.FeatureDescriptor;
import java.util.Iterator;
import java.util.List;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.PropertyNotFoundException;
import javax.el.PropertyNotWritableException;

import ortiz.perez.albin.jsf.util.Family;

public class UserELR extends ELResolver {
	
	private static final String FAMILY = "members";

	private final Class<?> CONTENT = List.class;

	@Override
	public Class<?> getCommonPropertyType(ELContext arg0, Object arg1) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public Iterator<FeatureDescriptor> getFeatureDescriptors(ELContext arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getType(ELContext arg0, Object arg1, Object arg2) {
		if (arg1 != null)
			return null;
		if (arg2 == null)
			throw new PropertyNotFoundException();
		if (arg1 == null && arg2.equals(FAMILY)) {
			arg0.setPropertyResolved(true);
			return CONTENT;
		}

		return null;
	}

	@Override
	public Object getValue(ELContext arg0, Object arg1, Object arg2) {
		if (arg1 == null && arg2.equals(FAMILY)) {
			arg0.setPropertyResolved(true);
			List<String> lol = Family.getFamily();
			System.out.println(lol.get(0));
			return lol;
		}
		return null;

	}

	@Override
	public boolean isReadOnly(ELContext arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setValue(ELContext arg0, Object arg1, Object arg2, Object arg3) {
		if (FAMILY.equals(arg3))
			throw new PropertyNotWritableException();

	}

}
