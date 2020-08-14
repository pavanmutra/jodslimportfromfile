evaluate(new File("${WORKSPACE}/artifacts.groovy"))
GroovyShell shell = new GroovyShell()
def tools = shell.parse(new File('artifacts.groovy'))
artifacts = tools.artifacts()

artifacts.each {
  job = it
        println(job);

  }
