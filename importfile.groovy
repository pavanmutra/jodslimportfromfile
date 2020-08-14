evaluate(new File("${WORKSPACE}/artifacts.groovy"))
GroovyShell shell = new GroovyShell()
def tools = shell.parse(new File('/Users/pmutra/.jenkins/workspace/jobdslimportfromfile/artifacts.groovy'))
artifacts = tools.artifacts()

artifacts.each {
  job = it
        println(job);

  }
