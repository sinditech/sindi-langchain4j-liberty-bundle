package za.co.sindi.langchain4j.spi.liberty.cdi.internal;

import java.lang.annotation.Annotation;
import java.util.Set;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import dev.langchain4j.service.sindi.AiService;
import io.openliberty.cdi.spi.CDIExtensionMetadata;
import jakarta.enterprise.inject.spi.Extension;
import za.co.sindi.langchain4j.spi.cdi.extension.LangChain4JAiServiceExtension;

/**
 * @author Buhake Sindi
 * @since 26 August 2024
 */
@Component(service = CDIExtensionMetadata.class, configurationPolicy = ConfigurationPolicy.IGNORE)
public class Langchain4JCDIExtensionMetadata implements CDIExtensionMetadata {

	/* (non-Javadoc)
	 * @see io.openliberty.cdi.spi.CDIExtensionMetadata#getBeanDefiningAnnotationClasses()
	 */
	@Override
	public Set<Class<? extends Annotation>> getBeanDefiningAnnotationClasses() {
		// TODO Auto-generated method stub
		return Set.of(AiService.class);
	}

	/* (non-Javadoc)
	 * @see io.openliberty.cdi.spi.CDIExtensionMetadata#getExtensions()
	 */
	@Override
	public Set<Class<? extends Extension>> getExtensions() {
		// TODO Auto-generated method stub
		return Set.of(LangChain4JAiServiceExtension.class);
	}
}
