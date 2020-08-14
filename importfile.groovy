evaluate(new File("${WORKSPACE}/artifacts.groovy"))
artifacts.each {
  job = it
        println(job);

  }
