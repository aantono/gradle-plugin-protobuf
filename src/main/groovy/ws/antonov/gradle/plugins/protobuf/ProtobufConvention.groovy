package ws.antonov.gradle.plugins.protobuf

import org.gradle.api.Project

class ProtobufConvention {
    def ProtobufConvention(Project project) {
        extractedProtosDir = "${project.buildDir.path}/extracted-protos"
    }

    def String protocPath = "protoc"
    /**
     * Directory to extract proto files into
     */
    def String extractedProtosDir
		
    /**
     * Whether ${sourceSet.name} should be appended to ${generatedFileDir}
     */
    def boolean appendSourceSetName

		/**
		 *	Directory to save java files to
		 */
		def String generatedFileDir 
}
