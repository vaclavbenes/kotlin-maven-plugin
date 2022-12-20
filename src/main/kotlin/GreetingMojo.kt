import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugin.MojoExecutionException
import org.apache.maven.plugins.annotations.Mojo

@Mojo(name = "sayhi")
class GreetingMojo : AbstractMojo() {
    @Throws(MojoExecutionException::class)
    override fun execute() {
        log.info("Hello, world.")
    }
}