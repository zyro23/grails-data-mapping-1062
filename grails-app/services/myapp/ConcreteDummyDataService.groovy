package myapp

import grails.gorm.services.Query
import grails.gorm.services.Service

@Service(ConcreteDummy)
interface ConcreteDummyDataService {

	@Query("from ${ConcreteDummy concreteDummy} where ${concreteDummy.myAbstractProperty} is null")
	ConcreteDummy compileMePlease()

}