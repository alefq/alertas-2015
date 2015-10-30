# alertas-2015
Proyecto base para trabajo práctico final de postgrado de Especialización Web - UCA Paraguay

Pasos para reutilizar este proyecto.
------------------------------------

- Se asume que se tiene el ambiente configurado con el Eclipse STS y el development.vars y general.properties correctamente.
- Renombrar en el pom.xml las siguientes claves (se muestra en formato de patch generado por el comando diff)
```
	@@ -1,11 +1,11 @@
	 <project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://maven.apache.org/POM/4.0.0"
			  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
		 <modelVersion>4.0.0</modelVersion>
	-    <groupId>py.edu.uca.test</groupId>
	-    <artifactId>uca-spring-test</artifactId>
	+    <groupId>py.edu.uca.afeltes</groupId>
	+    <artifactId>alertas-2015</artifactId>
		 <packaging>war</packaging>
	-    <version>0.0.1-SNAPSHOT</version>
	-    <name>uca-spring-test</name>
	+    <version>0.1</version>
	+    <name>alertas-2015</name>
	 
		 <properties>
			 <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	@@ -312,7 +312,7 @@
		 </dependencies>
	 
		 <build>
	-        <finalName>uca_spring_test_${project.version}</finalName>
	+        <finalName>alertas-2015-${project.version}</finalName>
			 <plugins>
				 <plugin>
					 <artifactId>maven-compiler-plugin</artifactId>
```
- Se importa el proyecto dentro del eclipse
- Se renombra el paquete principal py.uca.edu.afeltes al nombre de preferencia. Esto requiere de un "Preview" dentro del eclipse, y renombrará y cambiará la mayoría de los archivos de configuración. 
- Se edita el archivo src/main/webapp/WEB-INF/spring/spring-web-context.xml y se cambia la línea con el paquete elegido en el paso anterior
```
<context:component-scan base-package="py.edu.uca.afeltes.web" />
```
- Para publicar HTML planos y javascripts, se debe hacer en el directorio ```  
```
src/main/webappp/resources/public
```
El proyecto incluye una muestra que se publica en 

http://localhost:8080/pruebas-2015/public/ciclon.html


