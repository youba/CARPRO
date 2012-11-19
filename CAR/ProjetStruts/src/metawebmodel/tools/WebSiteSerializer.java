package metawebmodel.tools;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import metawebmodel.MetawebmodelPackage;
import metawebmodel.WebSite;

/**
 * 
 * @author marcgregoire
 * @generated NOT
 */
public class WebSiteSerializer {
	
	
	public WebSite load(File f) {
		ResourceSet rs = new ResourceSetImpl(); 
		Resource.Factory.Registry registry =rs.getResourceFactoryRegistry(); 
		Map<String,Object> m = registry.getExtensionToFactoryMap(); 
		m.put("xmi", new XMIResourceFactoryImpl()); 
		rs.getPackageRegistry().put(MetawebmodelPackage.eNS_URI,MetawebmodelPackage.eINSTANCE);
		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);

		if (resource.isLoaded() && resource.getContents().size() > 0) { 
			return (WebSite) resource.getContents().get(0);
		}
		return null;
	}
}
