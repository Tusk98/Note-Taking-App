package com.example.henry.notetakingapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by henry on 2017-10-24.
 */

public class DBManager extends ContentProvider {

  private static final String AUTHORITY = "com.example.henry.notetakingapp.dbmanager";
  private static final String BASE_PATH = "notes";
  public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + BASE_PATH );

  // Constant to identify the requested operation
  private static final int NOTES = 1;
  private static final int NOTES_ID = 2;
  private static final UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

  static {
    uriMatcher.addURI(AUTHORITY, BASE_PATH, NOTES);
    uriMatcher.addURI(AUTHORITY, BASE_PATH + "/#", NOTES_ID);
  }

  private SQLiteDatabase db;

  @Override
  public boolean onCreate() {
    DBHelper helper = new DBHelper(getContext());
    db = helper.getWritableDatabase();
    return true;
  }

  @Nullable
  @Override
  public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
    return null;
  }

  @Nullable
  @Override
  public String getType(@NonNull Uri uri) {
    return null;
  }

  @Nullable
  @Override
  public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
    return null;
  }

  @Override
  public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
    return 0;
  }

  @Override
  public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
    return 0;
  }
}
