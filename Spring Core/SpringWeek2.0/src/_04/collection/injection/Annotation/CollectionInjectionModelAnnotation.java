package _04.collection.injection.Annotation;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service("collectionInjectionModelAnnotation1")
//@Controller("collectionInjectionModelAnnotation1")
//@Repository("collectionInjectionModelAnnotation1")
@Component("collectionInjectionModelAnnotation1")
public class CollectionInjectionModelAnnotation {

	@Resource(name = "utilAnnotationList")
	// Collection typelari inject ederken , @Autowired yerine @Resource
	// annotationi kullanilir ya da @Value
	private List<String> nameList;

	@Value(value = "#{utilAnnotationMap}")
	private Map<String, Integer> keyValueMap;

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public Map<String, Integer> getKeyValueMap() {
		return keyValueMap;
	}

	public void setKeyValueMap(Map<String, Integer> keyValueMap) {
		this.keyValueMap = keyValueMap;
	}

	@Override
	public String toString() {
		return "CollectionInjectionModelAnnotation [nameList=" + nameList + ", keyValueMap=" + keyValueMap + "]";
	}

}
