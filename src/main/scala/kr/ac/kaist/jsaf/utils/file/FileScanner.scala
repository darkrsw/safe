package kr.ac.kaist.jsaf.utils.file

import java.io.File

import org.apache.commons.io.FileUtils

/**
  * Created by darkrsw on 2016/October/24.
  */
object FileScanner
{
  def findAllFiles(root: File): Array[File] =
  {
    val these = root.listFiles

    //these.foreach(x=> println(x.getCanonicalPath))

    these ++ these.filter(_.isDirectory).filter(!FileUtils.isSymlink(_)).flatMap(findAllFiles)
  }

  def collectFiles(rootPath: String, ext: String) = findAllFiles(new File(rootPath)).filter(!FileUtils.isSymlink(_)).filter(_.getName.toLowerCase.endsWith(ext))

  def collectClassFiles(rootPath: String) = collectFiles(rootPath, ".class")

  def collectJavaFiles(rootPath: String) = collectFiles(rootPath, ".java")

  def collectJarFiles(rootPath: String) = collectFiles(rootPath, ".jar")

  def collectJSFiles(rootPath: String) = collectFiles(rootPath, ".js")

  def collectHTMLFiles(rootPath: String): Array[File] = {
    val htmls = collectFiles(rootPath, ".html")
    val htms = collectFiles(rootPath, ".htm")
    val xhtmls = collectFiles(rootPath, ".xhtml")

    return htmls ++ htms ++ xhtmls
  }
}
