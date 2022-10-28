package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<persistence version="2.1"
		xmlns="http://xmlns.jcp.org/xml/ns/persistence"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
		<persistence-unit name="emp"
			transaction-type="RESOURCE_LOCAL">
			<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
			<properties>
				<property name="javax.persistence.jdbc.driver"
					value="com.mysql.jdbc.Driver" />
				<property name="javax.persistence.jdbc.url"
					value="jdbc:mysql://localhost:3306/employee1221?createDatabaseIfNotExist=true" />
				<property name="javax.persistence.jdbc.user" value="root" />
				<property name="javax.persistence.jdbc.password"
					value="5679" />
					<property name="hibernate.show_sql" value="true" />
				<property name="hibernate.format_sql" value="true" />
				<property name="hibernate.dialect"
					value="org.hibernate.dialect.MySQL5InnoDBDialect" />
				<property name="hibernate.hbm2ddl.auto" value="update" />
			</properties>
		</persistence-unit>
	</persistence>
}

