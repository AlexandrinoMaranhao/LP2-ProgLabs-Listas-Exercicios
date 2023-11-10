

Desktop desktop = Desktop.getDesktop();
String message = "mailto:dummy@domain.com?subject=First%20Email";
URI uri = URI.create(message);

desktop.mail(uri);
