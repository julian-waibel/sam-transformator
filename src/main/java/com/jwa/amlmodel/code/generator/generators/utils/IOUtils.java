package com.jwa.amlmodel.code.generator.generators.utils;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public final class IOUtils {
    private IOUtils() {}

    public static Path downloadFile(final URL urlFile, final Path destinationFile) throws IOException {
        if (urlFile == null) {
            throw new IllegalArgumentException("Passed url-file is null");
        }
        if (destinationFile == null) {
            throw new IllegalArgumentException("Passed destination-file is null");
        }
        FileUtils.copyURLToFile(urlFile, destinationFile.toFile(), 5000, 10000);
        return destinationFile;
    }

    public static Path createDirectoryIfNotExists(final Path directory) throws IOException {
        if (directory == null) {
            throw new IllegalArgumentException("Passed directory is null");
        }
        Files.createDirectories(directory);
        return directory;
    }

    public static void clearDirectory(final Path directory) throws IOException {
        if (!isValidDirectory(directory)) {
            throw new IllegalArgumentException("Passed directory '" + directory + "' doesn't exists or is not valid");
        }
        FileUtils.cleanDirectory(directory.toFile());
    }

    public static boolean isValidDirectory(final Path directory) {
        return directory != null && Files.exists(directory) && Files.isDirectory(directory);
    }

    public static boolean isValidFile(final Path file) {
        return file != null && Files.exists(file) && Files.isRegularFile(file);
    }
}
